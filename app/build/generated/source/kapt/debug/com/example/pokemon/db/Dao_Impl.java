package com.example.pokemon.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PokemonLocal> __insertionAdapterOfPokemonLocal;

  private final ListConverter __listConverter = new ListConverter();

  public Dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokemonLocal = new EntityInsertionAdapter<PokemonLocal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `pokemon` (`id`,`name`,`imageUrl`,`types`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PokemonLocal value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageUrl());
        }
        final String _tmp = __listConverter.fromList(value.getTypes());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
      }
    };
  }

  @Override
  public void insert(final PokemonLocal pokemonLocal) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPokemonLocal.insert(pokemonLocal);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<PokemonLocal>> getAll() {
    final String _sql = "SELECT * FROM pokemon";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"pokemon"}, false, new Callable<List<PokemonLocal>>() {
      @Override
      public List<PokemonLocal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfTypes = CursorUtil.getColumnIndexOrThrow(_cursor, "types");
          final List<PokemonLocal> _result = new ArrayList<PokemonLocal>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PokemonLocal _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            final List<String> _tmpTypes;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfTypes)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfTypes);
            }
            _tmpTypes = __listConverter.toList(_tmp);
            _item = new PokemonLocal(_tmpId,_tmpName,_tmpImageUrl,_tmpTypes);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

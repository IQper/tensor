package com.example.pokemon.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/example/pokemon/network/PokemonResponse;", "", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "name", "", "getName", "()Ljava/lang/String;", "sprites", "Lcom/example/pokemon/network/PokemonResponse$Sprites;", "getSprites", "()Lcom/example/pokemon/network/PokemonResponse$Sprites;", "stats", "", "Lcom/example/pokemon/network/PokemonResponse$Stats;", "getStats", "()Ljava/util/List;", "type", "Lcom/example/pokemon/network/PokemonResponse$Type;", "getType", "Sprites", "Stats", "Type", "app_debug"})
public final class PokemonResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.pokemon.network.PokemonResponse.Sprites sprites = null;
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "types")
    private final java.util.List<com.example.pokemon.network.PokemonResponse.Type> type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.pokemon.network.PokemonResponse.Stats> stats = null;
    
    public PokemonResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pokemon.network.PokemonResponse.Sprites getSprites() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.pokemon.network.PokemonResponse.Type> getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.pokemon.network.PokemonResponse.Stats> getStats() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/pokemon/network/PokemonResponse$Type;", "", "()V", "type", "Lcom/example/pokemon/network/PokemonResponse$Type$Type;", "getType", "()Lcom/example/pokemon/network/PokemonResponse$Type$Type;", "Type", "app_debug"})
    public static final class Type {
        
        public Type() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/pokemon/network/PokemonResponse$Sprites;", "", "()V", "other", "Lcom/example/pokemon/network/PokemonResponse$Sprites$Other;", "getOther", "()Lcom/example/pokemon/network/PokemonResponse$Sprites$Other;", "Other", "app_debug"})
    public static final class Sprites {
        @org.jetbrains.annotations.Nullable()
        private final com.example.pokemon.network.PokemonResponse.Sprites.Other other = null;
        
        public Sprites() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.pokemon.network.PokemonResponse.Sprites.Other getOther() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/pokemon/network/PokemonResponse$Sprites$Other;", "", "()V", "artwork", "Lcom/example/pokemon/network/PokemonResponse$Sprites$Other$OfficialArtwork;", "getArtwork", "()Lcom/example/pokemon/network/PokemonResponse$Sprites$Other$OfficialArtwork;", "OfficialArtwork", "app_debug"})
        public static final class Other {
            @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "official-artwork")
            private final com.example.pokemon.network.PokemonResponse.Sprites.Other.OfficialArtwork artwork = null;
            
            public Other() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.example.pokemon.network.PokemonResponse.Sprites.Other.OfficialArtwork getArtwork() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/pokemon/network/PokemonResponse$Sprites$Other$OfficialArtwork;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "app_debug"})
            public static final class OfficialArtwork {
                @org.jetbrains.annotations.Nullable()
                @com.squareup.moshi.Json(name = "front_default")
                private final java.lang.String url = null;
                
                public OfficialArtwork() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getUrl() {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/pokemon/network/PokemonResponse$Stats;", "", "()V", "app_debug"})
    public static final class Stats {
        
        public Stats() {
            super();
        }
    }
}
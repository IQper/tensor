package com.example.pokemon.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/pokemon/network/PokemonApi;", "", "getPokemon", "Lretrofit2/Response;", "Lcom/example/pokemon/network/PokemonResponse;", "pokemon", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PokemonApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v2/pokemon/{pokemon}")
    public abstract java.lang.Object getPokemon(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "pokemon")
    java.lang.String pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.pokemon.network.PokemonResponse>> continuation);
}
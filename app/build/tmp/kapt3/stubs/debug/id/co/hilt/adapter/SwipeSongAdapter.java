package id.co.hilt.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\"\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lid/co/hilt/adapter/SwipeSongAdapter;", "Lid/co/hilt/adapter/BaseAdapter;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lid/co/hilt/data/entities/Song;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "onBindViewHolder", "", "holder", "Lid/co/hilt/adapter/BaseAdapter$SongViewHolder;", "position", "", "app_debug"})
public final class SwipeSongAdapter extends id.co.hilt.adapter.BaseAdapter {
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<id.co.hilt.data.entities.Song> differ = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.AsyncListDiffer<id.co.hilt.data.entities.Song> getDiffer() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    id.co.hilt.adapter.BaseAdapter.SongViewHolder holder, int position) {
    }
    
    public SwipeSongAdapter() {
        super(0);
    }
}
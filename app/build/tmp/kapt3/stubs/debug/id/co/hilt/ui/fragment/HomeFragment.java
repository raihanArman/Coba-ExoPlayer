package id.co.hilt.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0010\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lid/co/hilt/ui/fragment/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mainViewModel", "Lid/co/hilt/ui/viewmodel/MainViewModel;", "getMainViewModel", "()Lid/co/hilt/ui/viewmodel/MainViewModel;", "setMainViewModel", "(Lid/co/hilt/ui/viewmodel/MainViewModel;)V", "songAdapter", "Lid/co/hilt/adapter/SongAdapter;", "getSongAdapter", "()Lid/co/hilt/adapter/SongAdapter;", "setSongAdapter", "(Lid/co/hilt/adapter/SongAdapter;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupResyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "subscribeToObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public id.co.hilt.ui.viewmodel.MainViewModel mainViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public id.co.hilt.adapter.SongAdapter songAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.hilt.ui.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    id.co.hilt.ui.viewmodel.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final id.co.hilt.adapter.SongAdapter getSongAdapter() {
        return null;
    }
    
    public final void setSongAdapter(@org.jetbrains.annotations.NotNull()
    id.co.hilt.adapter.SongAdapter p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView setupResyclerView() {
        return null;
    }
    
    private final void subscribeToObservers() {
    }
    
    public HomeFragment() {
        super();
    }
}
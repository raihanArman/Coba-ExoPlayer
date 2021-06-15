package id.co.hilt.ui.fragment;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import id.co.hilt.adapter.SongAdapter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<SongAdapter> songAdapterProvider;

  public HomeFragment_MembersInjector(Provider<SongAdapter> songAdapterProvider) {
    this.songAdapterProvider = songAdapterProvider;
  }

  public static MembersInjector<HomeFragment> create(Provider<SongAdapter> songAdapterProvider) {
    return new HomeFragment_MembersInjector(songAdapterProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectSongAdapter(instance, songAdapterProvider.get());
  }

  @InjectedFieldSignature("id.co.hilt.ui.fragment.HomeFragment.songAdapter")
  public static void injectSongAdapter(HomeFragment instance, SongAdapter songAdapter) {
    instance.songAdapter = songAdapter;
  }
}

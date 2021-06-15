package id.co.hilt.ui;

import com.bumptech.glide.RequestManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import id.co.hilt.adapter.SwipeSongAdapter;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<SwipeSongAdapter> swipeSongAdapterProvider;

  private final Provider<RequestManager> glideProvider;

  public MainActivity_MembersInjector(Provider<SwipeSongAdapter> swipeSongAdapterProvider,
      Provider<RequestManager> glideProvider) {
    this.swipeSongAdapterProvider = swipeSongAdapterProvider;
    this.glideProvider = glideProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<SwipeSongAdapter> swipeSongAdapterProvider, Provider<RequestManager> glideProvider) {
    return new MainActivity_MembersInjector(swipeSongAdapterProvider, glideProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectSwipeSongAdapter(instance, swipeSongAdapterProvider.get());
    injectGlide(instance, glideProvider.get());
  }

  @InjectedFieldSignature("id.co.hilt.ui.MainActivity.swipeSongAdapter")
  public static void injectSwipeSongAdapter(MainActivity instance,
      SwipeSongAdapter swipeSongAdapter) {
    instance.swipeSongAdapter = swipeSongAdapter;
  }

  @InjectedFieldSignature("id.co.hilt.ui.MainActivity.glide")
  public static void injectGlide(MainActivity instance, RequestManager glide) {
    instance.glide = glide;
  }
}

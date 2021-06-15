package id.co.hilt.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import id.co.hilt.adapter.SwipeSongAdapter;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSwipeSongAdapterFactory implements Factory<SwipeSongAdapter> {
  @Override
  public SwipeSongAdapter get() {
    return provideSwipeSongAdapter();
  }

  public static AppModule_ProvideSwipeSongAdapterFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SwipeSongAdapter provideSwipeSongAdapter() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideSwipeSongAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideSwipeSongAdapterFactory INSTANCE = new AppModule_ProvideSwipeSongAdapterFactory();
  }
}

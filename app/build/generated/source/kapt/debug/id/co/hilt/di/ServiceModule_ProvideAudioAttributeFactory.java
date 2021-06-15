package id.co.hilt.di;

import com.google.android.exoplayer2.audio.AudioAttributes;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideAudioAttributeFactory implements Factory<AudioAttributes> {
  @Override
  public AudioAttributes get() {
    return provideAudioAttribute();
  }

  public static ServiceModule_ProvideAudioAttributeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AudioAttributes provideAudioAttribute() {
    return Preconditions.checkNotNull(ServiceModule.INSTANCE.provideAudioAttribute(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final ServiceModule_ProvideAudioAttributeFactory INSTANCE = new ServiceModule_ProvideAudioAttributeFactory();
  }
}

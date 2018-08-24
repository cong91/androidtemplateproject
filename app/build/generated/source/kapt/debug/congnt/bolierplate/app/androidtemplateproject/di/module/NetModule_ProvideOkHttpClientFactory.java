// Generated by Dagger (https://google.github.io/dagger).
package congnt.bolierplate.app.androidtemplateproject.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

public final class NetModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetModule module;

  public NetModule_ProvideOkHttpClientFactory(NetModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetModule_ProvideOkHttpClientFactory create(NetModule module) {
    return new NetModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient proxyProvideOkHttpClient(NetModule instance) {
    return Preconditions.checkNotNull(
        instance.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}

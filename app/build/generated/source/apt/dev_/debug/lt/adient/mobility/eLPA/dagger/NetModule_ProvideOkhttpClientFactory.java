// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package lt.adient.mobility.eLPA.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lt.adient.mobility.eLPA.ws.BaseUrlInterceptor;
import okhttp3.OkHttpClient;

public final class NetModule_ProvideOkhttpClientFactory implements Factory<OkHttpClient> {
  private final NetModule module;

  private final Provider<BaseUrlInterceptor> interceptorProvider;

  public NetModule_ProvideOkhttpClientFactory(
      NetModule module, Provider<BaseUrlInterceptor> interceptorProvider) {
    assert module != null;
    this.module = module;
    assert interceptorProvider != null;
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkhttpClient(interceptorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(
      NetModule module, Provider<BaseUrlInterceptor> interceptorProvider) {
    return new NetModule_ProvideOkhttpClientFactory(module, interceptorProvider);
  }
}
// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package lt.adient.mobility.eLPA.dagger;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lt.adient.mobility.eLPA.utils.PrefManager;
import lt.adient.mobility.eLPA.ws.BaseUrlInterceptor;

public final class AndroidModule_ProvidePreferenceManagerFactory implements Factory<PrefManager> {
  private final AndroidModule module;

  private final Provider<SharedPreferences> preferencesProvider;

  private final Provider<BaseUrlInterceptor> interceptorProvider;

  public AndroidModule_ProvidePreferenceManagerFactory(
      AndroidModule module,
      Provider<SharedPreferences> preferencesProvider,
      Provider<BaseUrlInterceptor> interceptorProvider) {
    assert module != null;
    this.module = module;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
    assert interceptorProvider != null;
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public PrefManager get() {
    return Preconditions.checkNotNull(
        module.providePreferenceManager(preferencesProvider.get(), interceptorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PrefManager> create(
      AndroidModule module,
      Provider<SharedPreferences> preferencesProvider,
      Provider<BaseUrlInterceptor> interceptorProvider) {
    return new AndroidModule_ProvidePreferenceManagerFactory(
        module, preferencesProvider, interceptorProvider);
  }
}

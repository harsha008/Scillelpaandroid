// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package lt.adient.mobility.eLPA.activity.settings;

import dagger.MembersInjector;
import javax.inject.Provider;
import lt.adient.mobility.eLPA.utils.PrefManager;
import lt.adient.mobility.eLPA.utils.Translator;

public final class SettingsActivity_MembersInjector implements MembersInjector<SettingsActivity> {
  private final Provider<SettingsPresenter> presenterProvider;

  private final Provider<Translator> translatorProvider;

  private final Provider<PrefManager> prefManagerProvider;

  public SettingsActivity_MembersInjector(
      Provider<SettingsPresenter> presenterProvider,
      Provider<Translator> translatorProvider,
      Provider<PrefManager> prefManagerProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
    assert translatorProvider != null;
    this.translatorProvider = translatorProvider;
    assert prefManagerProvider != null;
    this.prefManagerProvider = prefManagerProvider;
  }

  public static MembersInjector<SettingsActivity> create(
      Provider<SettingsPresenter> presenterProvider,
      Provider<Translator> translatorProvider,
      Provider<PrefManager> prefManagerProvider) {
    return new SettingsActivity_MembersInjector(
        presenterProvider, translatorProvider, prefManagerProvider);
  }

  @Override
  public void injectMembers(SettingsActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    lt.adient.mobility.eLPA.mvp.MvpActivity_MembersInjector.injectPresenter(
        instance, presenterProvider);
    instance.translator = translatorProvider.get();
    instance.prefManager = prefManagerProvider.get();
  }

  public static void injectTranslator(
      SettingsActivity instance, Provider<Translator> translatorProvider) {
    instance.translator = translatorProvider.get();
  }

  public static void injectPrefManager(
      SettingsActivity instance, Provider<PrefManager> prefManagerProvider) {
    instance.prefManager = prefManagerProvider.get();
  }
}

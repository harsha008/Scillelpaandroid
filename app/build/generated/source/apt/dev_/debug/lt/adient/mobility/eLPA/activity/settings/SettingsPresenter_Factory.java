// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package lt.adient.mobility.eLPA.activity.settings;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;
import lt.adient.mobility.eLPA.database.LanguageRepository;
import lt.adient.mobility.eLPA.database.ModuleRepository;
import lt.adient.mobility.eLPA.database.TranslationRepository;
import lt.adient.mobility.eLPA.utils.PrefManager;
import lt.adient.mobility.eLPA.ws.SciilAPI;

public final class SettingsPresenter_Factory implements Factory<SettingsPresenter> {
  private final MembersInjector<SettingsPresenter> settingsPresenterMembersInjector;

  private final Provider<ModuleRepository> moduleRepositoryProvider;

  private final Provider<PrefManager> prefManagerProvider;

  private final Provider<SciilAPI> sciilAPIProvider;

  private final Provider<TranslationRepository> translationRepositoryProvider;

  private final Provider<LanguageRepository> languageRepositoryProvider;

  public SettingsPresenter_Factory(
      MembersInjector<SettingsPresenter> settingsPresenterMembersInjector,
      Provider<ModuleRepository> moduleRepositoryProvider,
      Provider<PrefManager> prefManagerProvider,
      Provider<SciilAPI> sciilAPIProvider,
      Provider<TranslationRepository> translationRepositoryProvider,
      Provider<LanguageRepository> languageRepositoryProvider) {
    assert settingsPresenterMembersInjector != null;
    this.settingsPresenterMembersInjector = settingsPresenterMembersInjector;
    assert moduleRepositoryProvider != null;
    this.moduleRepositoryProvider = moduleRepositoryProvider;
    assert prefManagerProvider != null;
    this.prefManagerProvider = prefManagerProvider;
    assert sciilAPIProvider != null;
    this.sciilAPIProvider = sciilAPIProvider;
    assert translationRepositoryProvider != null;
    this.translationRepositoryProvider = translationRepositoryProvider;
    assert languageRepositoryProvider != null;
    this.languageRepositoryProvider = languageRepositoryProvider;
  }

  @Override
  public SettingsPresenter get() {
    return MembersInjectors.injectMembers(
        settingsPresenterMembersInjector,
        new SettingsPresenter(
            moduleRepositoryProvider.get(),
            prefManagerProvider.get(),
            sciilAPIProvider.get(),
            translationRepositoryProvider.get(),
            languageRepositoryProvider.get()));
  }

  public static Factory<SettingsPresenter> create(
      MembersInjector<SettingsPresenter> settingsPresenterMembersInjector,
      Provider<ModuleRepository> moduleRepositoryProvider,
      Provider<PrefManager> prefManagerProvider,
      Provider<SciilAPI> sciilAPIProvider,
      Provider<TranslationRepository> translationRepositoryProvider,
      Provider<LanguageRepository> languageRepositoryProvider) {
    return new SettingsPresenter_Factory(
        settingsPresenterMembersInjector,
        moduleRepositoryProvider,
        prefManagerProvider,
        sciilAPIProvider,
        translationRepositoryProvider,
        languageRepositoryProvider);
  }
}

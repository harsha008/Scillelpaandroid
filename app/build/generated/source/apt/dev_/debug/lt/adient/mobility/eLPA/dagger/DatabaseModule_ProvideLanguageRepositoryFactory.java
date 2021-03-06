// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package lt.adient.mobility.eLPA.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lt.adient.mobility.eLPA.database.DatabaseHelper;
import lt.adient.mobility.eLPA.database.LanguageRepository;

public final class DatabaseModule_ProvideLanguageRepositoryFactory
    implements Factory<LanguageRepository> {
  private final DatabaseModule module;

  private final Provider<DatabaseHelper> databaseHelperProvider;

  public DatabaseModule_ProvideLanguageRepositoryFactory(
      DatabaseModule module, Provider<DatabaseHelper> databaseHelperProvider) {
    assert module != null;
    this.module = module;
    assert databaseHelperProvider != null;
    this.databaseHelperProvider = databaseHelperProvider;
  }

  @Override
  public LanguageRepository get() {
    return Preconditions.checkNotNull(
        module.provideLanguageRepository(databaseHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LanguageRepository> create(
      DatabaseModule module, Provider<DatabaseHelper> databaseHelperProvider) {
    return new DatabaseModule_ProvideLanguageRepositoryFactory(module, databaseHelperProvider);
  }
}

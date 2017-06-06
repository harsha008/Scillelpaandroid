// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package lt.adient.mobility.eLPA.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lt.adient.mobility.eLPA.database.DatabaseHelper;
import lt.adient.mobility.eLPA.database.WorkstationRepository;

public final class DatabaseModule_ProvideWorkstationRepositoryFactory
    implements Factory<WorkstationRepository> {
  private final DatabaseModule module;

  private final Provider<DatabaseHelper> databaseHelperProvider;

  public DatabaseModule_ProvideWorkstationRepositoryFactory(
      DatabaseModule module, Provider<DatabaseHelper> databaseHelperProvider) {
    assert module != null;
    this.module = module;
    assert databaseHelperProvider != null;
    this.databaseHelperProvider = databaseHelperProvider;
  }

  @Override
  public WorkstationRepository get() {
    return Preconditions.checkNotNull(
        module.provideWorkstationRepository(databaseHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WorkstationRepository> create(
      DatabaseModule module, Provider<DatabaseHelper> databaseHelperProvider) {
    return new DatabaseModule_ProvideWorkstationRepositoryFactory(module, databaseHelperProvider);
  }
}
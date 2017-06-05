// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package lt.adient.mobility.eLPA.mvp;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class MvpFragment_MembersInjector<V extends BaseView, P extends BasePresenter<V>>
    implements MembersInjector<MvpFragment<V, P>> {
  private final Provider<P> presenterProvider;

  public MvpFragment_MembersInjector(Provider<P> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static <V extends BaseView, P extends BasePresenter<V>>
      MembersInjector<MvpFragment<V, P>> create(Provider<P> presenterProvider) {
    return new MvpFragment_MembersInjector<V, P>(presenterProvider);
  }

  @Override
  public void injectMembers(MvpFragment<V, P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static <V extends BaseView, P extends BasePresenter<V>> void injectPresenter(
      MvpFragment<V, P> instance, Provider<P> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}

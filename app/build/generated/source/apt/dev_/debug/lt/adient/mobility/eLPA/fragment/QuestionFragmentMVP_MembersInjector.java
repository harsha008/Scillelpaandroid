// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package lt.adient.mobility.eLPA.fragment;

import dagger.MembersInjector;
import javax.inject.Provider;
import lt.adient.mobility.eLPA.utils.ImageLoading;
import lt.adient.mobility.eLPA.utils.Translator;

public final class QuestionFragmentMVP_MembersInjector
    implements MembersInjector<QuestionFragmentMVP> {
  private final Provider<QuestionFragmentPresenter> presenterProvider;

  private final Provider<Translator> translatorProvider;

  private final Provider<ImageLoading> imageLoadingProvider;

  public QuestionFragmentMVP_MembersInjector(
      Provider<QuestionFragmentPresenter> presenterProvider,
      Provider<Translator> translatorProvider,
      Provider<ImageLoading> imageLoadingProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
    assert translatorProvider != null;
    this.translatorProvider = translatorProvider;
    assert imageLoadingProvider != null;
    this.imageLoadingProvider = imageLoadingProvider;
  }

  public static MembersInjector<QuestionFragmentMVP> create(
      Provider<QuestionFragmentPresenter> presenterProvider,
      Provider<Translator> translatorProvider,
      Provider<ImageLoading> imageLoadingProvider) {
    return new QuestionFragmentMVP_MembersInjector(
        presenterProvider, translatorProvider, imageLoadingProvider);
  }

  @Override
  public void injectMembers(QuestionFragmentMVP instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    lt.adient.mobility.eLPA.mvp.MvpFragment_MembersInjector.injectPresenter(
        instance, presenterProvider);
    instance.translator = translatorProvider.get();
    instance.imageLoading = imageLoadingProvider.get();
  }

  public static void injectTranslator(
      QuestionFragmentMVP instance, Provider<Translator> translatorProvider) {
    instance.translator = translatorProvider.get();
  }

  public static void injectImageLoading(
      QuestionFragmentMVP instance, Provider<ImageLoading> imageLoadingProvider) {
    instance.imageLoading = imageLoadingProvider.get();
  }
}
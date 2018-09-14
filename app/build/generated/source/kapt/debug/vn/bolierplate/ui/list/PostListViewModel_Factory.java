// Generated by Dagger (https://google.github.io/dagger).
package vn.bolierplate.ui.list;

import android.app.Application;
import dagger.internal.Factory;
import javax.inject.Provider;
import vn.bolierplate.network.PostRepository;

public final class PostListViewModel_Factory implements Factory<PostListViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<PostRepository> postRepositoryProvider;

  public PostListViewModel_Factory(
      Provider<Application> appProvider, Provider<PostRepository> postRepositoryProvider) {
    this.appProvider = appProvider;
    this.postRepositoryProvider = postRepositoryProvider;
  }

  @Override
  public PostListViewModel get() {
    PostListViewModel instance = new PostListViewModel(appProvider.get());
    PostListViewModel_MembersInjector.injectPostRepository(instance, postRepositoryProvider.get());
    return instance;
  }

  public static PostListViewModel_Factory create(
      Provider<Application> appProvider, Provider<PostRepository> postRepositoryProvider) {
    return new PostListViewModel_Factory(appProvider, postRepositoryProvider);
  }

  public static PostListViewModel newPostListViewModel(Application app) {
    return new PostListViewModel(app);
  }
}

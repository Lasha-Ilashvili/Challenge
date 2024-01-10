// Generated by Dagger (https://dagger.dev).
package com.example.challenge.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Flow;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<Flow<String>> authTokenFlowProvider;

  private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  public AppModule_ProvideOkHttpClientFactory(Provider<Flow<String>> authTokenFlowProvider,
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    this.authTokenFlowProvider = authTokenFlowProvider;
    this.loggingInterceptorProvider = loggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(authTokenFlowProvider.get(), loggingInterceptorProvider.get());
  }

  public static AppModule_ProvideOkHttpClientFactory create(
      Provider<Flow<String>> authTokenFlowProvider,
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    return new AppModule_ProvideOkHttpClientFactory(authTokenFlowProvider, loggingInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(Flow<String> authTokenFlow,
      HttpLoggingInterceptor loggingInterceptor) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideOkHttpClient(authTokenFlow, loggingInterceptor));
  }
}

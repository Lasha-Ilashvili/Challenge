// Generated by Dagger (https://dagger.dev).
package com.example.challenge.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DataStoreModule_ProvideDataSoreFactory implements Factory<DataStore<Preferences>> {
  private final Provider<Context> contextProvider;

  public DataStoreModule_ProvideDataSoreFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStore<Preferences> get() {
    return provideDataSore(contextProvider.get());
  }

  public static DataStoreModule_ProvideDataSoreFactory create(Provider<Context> contextProvider) {
    return new DataStoreModule_ProvideDataSoreFactory(contextProvider);
  }

  public static DataStore<Preferences> provideDataSore(Context context) {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.provideDataSore(context));
  }
}

// Generated by Dagger (https://dagger.dev).
package com.mazroid.hilttest;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.mazroid.hilttest.database.AppDatabase;
import com.mazroid.hilttest.database.DatabaseModule;
import com.mazroid.hilttest.database.DatabaseModule_ProvideAppDatabaseFactory;
import com.mazroid.hilttest.database.DatabaseModule_ProvideGsonFactory;
import com.mazroid.hilttest.di.AppModule;
import com.mazroid.hilttest.di.AppModule_ProvideApplicationFactory;
import com.mazroid.hilttest.network.NetworkModule;
import com.mazroid.hilttest.network.NetworkModule_ProvideConverterFactoryFactory;
import com.mazroid.hilttest.network.NetworkModule_ProvideLoggingInterceptorFactory;
import com.mazroid.hilttest.network.NetworkModule_ProvideNetworkServicesFactory;
import com.mazroid.hilttest.network.NetworkModule_ProvideOkHttpBuilderFactory;
import com.mazroid.hilttest.network.NetworkModule_ProvideRetrofitFactory;
import com.mazroid.hilttest.network.NetworkModule_ProvideRxJava2CallAdapterFactoryFactory;
import com.mazroid.hilttest.network.NetworkServices;
import com.mazroid.hilttest.ui.MainActivity;
import com.mazroid.hilttest.ui.repo.MainRepo;
import com.mazroid.hilttest.ui.viewmodel.MainViewModel;
import com.mazroid.hilttest.ui.viewmodel.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMyApplication_HiltComponents_SingletonC extends MyApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerMyApplication_HiltComponents_SingletonC singletonC = this;

  private volatile Object myApplication = new MemoizedSentinel();

  private DaggerMyApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private MyApplication myApplication() {
    Object local = myApplication;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = myApplication;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideApplicationFactory.provideApplication(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          myApplication = DoubleCheck.reentrantCheck(myApplication, local);
        }
      }
    }
    return (MyApplication) local;
  }

  private OkHttpClient okHttpClient() {
    return NetworkModule_ProvideOkHttpBuilderFactory.provideOkHttpBuilder(NetworkModule_ProvideLoggingInterceptorFactory.provideLoggingInterceptor(), myApplication());
  }

  private Retrofit retrofit() {
    return NetworkModule_ProvideRetrofitFactory.provideRetrofit(NetworkModule_ProvideConverterFactoryFactory.provideConverterFactory(), NetworkModule_ProvideRxJava2CallAdapterFactoryFactory.provideRxJava2CallAdapterFactory(), okHttpClient());
  }

  private NetworkServices networkServices() {
    return NetworkModule_ProvideNetworkServicesFactory.provideNetworkServices(retrofit());
  }

  private AppDatabase appDatabase() {
    return DatabaseModule_ProvideAppDatabaseFactory.provideAppDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public MyApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerMyApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl(DaggerMyApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private static final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private Activity activity;

      private ActivityCBuilder(DaggerMyApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
      }

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
      }
    }

    private static final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl = this;

      private ActivityCImpl(DaggerMyApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, Activity activity) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;

      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
      }

      @Override
      public Set<String> getViewModelKeys() {
        return Collections.<String>singleton(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide());
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
      }

      private static final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private Fragment fragment;

        private FragmentCBuilder(DaggerMyApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;
        }

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCI(singletonC, activityRetainedCImpl, activityCImpl, fragment);
        }
      }

      private static final class FragmentCI extends MyApplication_HiltComponents.FragmentC {
        private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private final FragmentCI fragmentCI = this;

        private FragmentCI(DaggerMyApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
            Fragment fragment) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;

        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCI);
        }

        private static final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

          private final ActivityRetainedCImpl activityRetainedCImpl;

          private final ActivityCImpl activityCImpl;

          private final FragmentCI fragmentCI;

          private View view;

          private ViewWithFragmentCBuilder(DaggerMyApplication_HiltComponents_SingletonC singletonC,
              ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
              FragmentCI fragmentCI) {
            this.singletonC = singletonC;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCI = fragmentCI;
          }

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCI(singletonC, activityRetainedCImpl, activityCImpl, fragmentCI, view);
          }
        }

        private static final class ViewWithFragmentCI extends MyApplication_HiltComponents.ViewWithFragmentC {
          private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

          private final ActivityRetainedCImpl activityRetainedCImpl;

          private final ActivityCImpl activityCImpl;

          private final FragmentCI fragmentCI;

          private final ViewWithFragmentCI viewWithFragmentCI = this;

          private ViewWithFragmentCI(DaggerMyApplication_HiltComponents_SingletonC singletonC,
              ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
              FragmentCI fragmentCI, View view) {
            this.singletonC = singletonC;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCI = fragmentCI;

          }
        }
      }

      private static final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private View view;

        private ViewCBuilder(DaggerMyApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;
        }

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCI(singletonC, activityRetainedCImpl, activityCImpl, view);
        }
      }

      private static final class ViewCI extends MyApplication_HiltComponents.ViewC {
        private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ActivityCImpl activityCImpl;

        private final ViewCI viewCI = this;

        private ViewCI(DaggerMyApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View view) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.activityCImpl = activityCImpl;

        }
      }
    }

    private static final class ViewModelCBuilder implements MyApplication_HiltComponents.ViewModelC.Builder {
      private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private SavedStateHandle savedStateHandle;

      private ViewModelCBuilder(DaggerMyApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
      }

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
      }
    }

    private static final class ViewModelCImpl extends MyApplication_HiltComponents.ViewModelC {
      private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl = this;

      private volatile Provider<MainViewModel> mainViewModelProvider;

      private ViewModelCImpl(DaggerMyApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandle) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;

      }

      private MainRepo mainRepo() {
        return new MainRepo(singletonC.networkServices(), singletonC.appDatabase(), singletonC.myApplication(), DatabaseModule_ProvideGsonFactory.provideGson());
      }

      private MainViewModel mainViewModel() {
        return new MainViewModel(mainRepo());
      }

      private Provider<MainViewModel> mainViewModelProvider() {
        Object local = mainViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
          mainViewModelProvider = (Provider<MainViewModel>) local;
        }
        return (Provider<MainViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return Collections.<String, Provider<ViewModel>>singletonMap("com.mazroid.hilttest.ui.viewmodel.MainViewModel", (Provider) mainViewModelProvider());
      }

      private static final class SwitchingProvider<T> implements Provider<T> {
        private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

        private final ActivityRetainedCImpl activityRetainedCImpl;

        private final ViewModelCImpl viewModelCImpl;

        private final int id;

        SwitchingProvider(DaggerMyApplication_HiltComponents_SingletonC singletonC,
            ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
          this.singletonC = singletonC;
          this.activityRetainedCImpl = activityRetainedCImpl;
          this.viewModelCImpl = viewModelCImpl;
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.mazroid.hilttest.ui.viewmodel.MainViewModel 
            return (T) viewModelCImpl.mainViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private static final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerMyApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private final DaggerMyApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerMyApplication_HiltComponents_SingletonC singletonC,
        Service service) {
      this.singletonC = singletonC;

    }
  }
}

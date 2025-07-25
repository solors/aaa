package com.unity3d.services.core.p621di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ServiceProvider.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.ServiceProvider */
/* loaded from: classes7.dex */
public final class ServiceProvider implements IServiceProvider {
    @NotNull
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    @NotNull
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    @NotNull
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    @NotNull
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    @NotNull
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    @NotNull
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    @NotNull
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    @NotNull
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    @NotNull
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    @NotNull
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    @NotNull
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    @NotNull
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    @NotNull
    public static final ServiceProvider INSTANCE;
    @NotNull
    public static final String IO_DISPATCHER = "io_dispatcher";
    @NotNull
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    @NotNull
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    @NotNull
    public static final String NAMED_AD_REQ = "ad_req";
    @NotNull
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    @NotNull
    public static final String NAMED_INIT_REQ = "init_req";
    @NotNull
    public static final String NAMED_INIT_SCOPE = "init_scope";
    @NotNull
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    @NotNull
    public static final String NAMED_LOCAL = "local";
    @NotNull
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    @NotNull
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    @NotNull
    public static final String NAMED_OTHER_REQ = "other_req";
    @NotNull
    public static final String NAMED_PUBLIC_JOB = "public_job";
    @NotNull
    public static final String NAMED_REMOTE = "remote";
    @NotNull
    public static final String NAMED_SCAR_SCOPE = "scar_scope";
    @NotNull
    public static final String NAMED_SDK = "sdk";
    @NotNull
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    @NotNull
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    @NotNull
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;
    @NotNull
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.p621di.IServiceProvider
    @NotNull
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.p621di.IServiceProvider
    @NotNull
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(ServiceProvider$initialize$1.INSTANCE);
    }
}

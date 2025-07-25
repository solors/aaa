package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f5372a;

    /* renamed from: b */
    private final Object f5373b = new Object();

    /* renamed from: b */
    public static /* synthetic */ void m100084b(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        AppLovinBroadcastManager.sendBroadcastSync(appLovinCommunicatorMessage, null);
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m100083c(Runnable runnable) {
        return m100085a(runnable);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(final AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        ScheduledThreadPoolExecutor m100087a = m100087a();
        this.f5372a = m100087a;
        m100087a.execute(new Runnable() { // from class: com.applovin.impl.communicator.b
            @Override // java.lang.Runnable
            public final void run() {
                MessagingServiceImpl.m100084b(AppLovinCommunicatorMessage.this);
            }
        });
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m100087a() {
        synchronized (this.f5373b) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f5372a;
            if (scheduledThreadPoolExecutor != null) {
                return scheduledThreadPoolExecutor;
            }
            return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.a
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return MessagingServiceImpl.m100083c(runnable);
                }
            });
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m100085a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}

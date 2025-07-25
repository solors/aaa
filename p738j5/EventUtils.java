package p738j5;

import android.os.Bundle;
import java.util.Map;
import p028b5.BridgeManager;
import p682g5.LifeCycleManager;
import p682g5.SpManager;
import p695h5.IUserTagProcessor;

/* renamed from: j5.c */
/* loaded from: classes6.dex */
public class EventUtils {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventUtils.java */
    /* renamed from: j5.c$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C37292a {

        /* renamed from: a */
        static final /* synthetic */ int[] f98452a;

        static {
            int[] iArr = new int[IUserTagProcessor.EnumC33479a.values().length];
            f98452a = iArr;
            try {
                iArr[IUserTagProcessor.EnumC33479a.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98452a[IUserTagProcessor.EnumC33479a.ADD_LOCAL_TAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98452a[IUserTagProcessor.EnumC33479a.REMOVE_LOCAL_TAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static void m18544a(Map<String, Object> map, IUserTagProcessor.EnumC33479a enumC33479a) {
        m18542c(map);
        m18543b(enumC33479a);
    }

    /* renamed from: b */
    private static void m18543b(IUserTagProcessor.EnumC33479a enumC33479a) {
        Bundle bundle = new Bundle();
        int i = C37292a.f98452a[enumC33479a.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                bundle.putString("user_tag_source", "other");
                BridgeManager.m103922j("learnings_user_tag_change", bundle);
                return;
            }
            bundle.putString("user_tag_source", "local");
            BridgeManager.m103922j("learnings_user_tag_change", bundle);
            return;
        }
        SpManager.C33210c m24297b = SpManager.m24298a().m24297b(LifeCycleManager.m24309f().m24308g());
        if (!m24297b.m24285c("learnings_user_tag_change_event", false)) {
            bundle.putString("user_tag_source", "other");
            BridgeManager.m103922j("learnings_user_tag_change", bundle);
            m24297b.m24280h("learnings_user_tag_change_event", true);
        }
    }

    /* renamed from: c */
    private static void m18542c(Map<String, Object> map) {
        BridgeManager.m103921k("learnings_user_tags", GsonUtils.m18539c(map));
    }
}

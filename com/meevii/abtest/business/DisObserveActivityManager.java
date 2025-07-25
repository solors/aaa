package com.meevii.abtest.business;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class DisObserveActivityManager {
    private List<Class<? extends Activity>> mDisableObserveActivityList;

    /* loaded from: classes6.dex */
    private static class Holder {
        private static final DisObserveActivityManager singleton = new DisObserveActivityManager();

        private Holder() {
        }
    }

    public static DisObserveActivityManager get() {
        return Holder.singleton;
    }

    @SafeVarargs
    public final void addDisObserveActivity(Class<? extends Activity>... clsArr) {
        if (clsArr != null && clsArr.length != 0) {
            if (this.mDisableObserveActivityList == null) {
                this.mDisableObserveActivityList = new ArrayList();
            }
            this.mDisableObserveActivityList.addAll(new ArrayList(Arrays.asList(clsArr)));
            return;
        }
        throw new NullPointerException("addDisObserveActivity method parameter cannot be empty or null");
    }

    public boolean isDisObserveActivity(Class<? extends Activity> cls) {
        List<Class<? extends Activity>> list;
        if (cls != null && (list = this.mDisableObserveActivityList) != null) {
            return list.contains(cls);
        }
        return false;
    }

    private DisObserveActivityManager() {
    }
}

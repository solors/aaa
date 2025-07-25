package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: com.ironsource.lifecycle.a */
/* loaded from: classes6.dex */
public class FragmentC20269a extends Fragment {

    /* renamed from: b */
    private static final String f50999b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* renamed from: a */
    private InterfaceC20270a f51000a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.lifecycle.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC20270a {
        /* renamed from: a */
        void mo57438a(Activity activity);

        /* renamed from: b */
        void mo57437b(Activity activity);

        void onResume(Activity activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FragmentC20269a m57466a(Activity activity) {
        return (FragmentC20269a) activity.getFragmentManager().findFragmentByTag(f50999b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m57464b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f50999b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new FragmentC20269a(), f50999b).commit();
        fragmentManager.executePendingTransactions();
    }

    /* renamed from: c */
    private void m57462c(InterfaceC20270a interfaceC20270a) {
        if (interfaceC20270a != null) {
            interfaceC20270a.mo57438a(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m57461d(InterfaceC20270a interfaceC20270a) {
        this.f51000a = interfaceC20270a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m57465a(this.f51000a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f51000a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m57463b(this.f51000a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m57462c(this.f51000a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    /* renamed from: a */
    private void m57465a(InterfaceC20270a interfaceC20270a) {
        if (interfaceC20270a != null) {
            interfaceC20270a.mo57437b(getActivity());
        }
    }

    /* renamed from: b */
    private void m57463b(InterfaceC20270a interfaceC20270a) {
        if (interfaceC20270a != null) {
            interfaceC20270a.onResume(getActivity());
        }
    }
}

package com.unity3d.player;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.player.UnityPermissions;

/* loaded from: classes7.dex */
public class PermissionFragment extends Fragment {
    public static final String PERMISSION_NAMES = "PermissionNames";
    public static final int UNITY_PERMISSION_REQUEST_CODE = 96489;
    private final Activity m_Activity;
    private final Looper m_Looper;
    private final IPermissionRequestCallbacks m_ResultCallbacks;

    /* renamed from: com.unity3d.player.PermissionFragment$a */
    /* loaded from: classes7.dex */
    class RunnableC28717a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String[] f74592a;

        RunnableC28717a(String[] strArr) {
            this.f74592a = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            PermissionFragment.this.reportAllDenied(this.f74592a);
        }
    }

    /* renamed from: com.unity3d.player.PermissionFragment$b */
    /* loaded from: classes7.dex */
    class RunnableC28718b implements Runnable {

        /* renamed from: a */
        private IPermissionRequestCallbacks f74594a;

        /* renamed from: b */
        private String f74595b;

        /* renamed from: c */
        private int f74596c;

        /* renamed from: d */
        private boolean f74597d;

        RunnableC28718b(PermissionFragment permissionFragment, IPermissionRequestCallbacks iPermissionRequestCallbacks, String str, int i, boolean z) {
            this.f74594a = iPermissionRequestCallbacks;
            this.f74595b = str;
            this.f74596c = i;
            this.f74597d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f74596c;
            if (i == -1) {
                if (Build.VERSION.SDK_INT < 30 && !this.f74597d) {
                    this.f74594a.onPermissionDeniedAndDontAskAgain(this.f74595b);
                } else {
                    this.f74594a.onPermissionDenied(this.f74595b);
                }
            } else if (i == 0) {
                this.f74594a.onPermissionGranted(this.f74595b);
            }
        }
    }

    public PermissionFragment() {
        this.m_ResultCallbacks = null;
        this.m_Activity = null;
        this.m_Looper = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportAllDenied(String[] strArr) {
        for (String str : strArr) {
            this.m_ResultCallbacks.onPermissionDenied(str);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray(PERMISSION_NAMES), UNITY_PERMISSION_REQUEST_CODE);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 96489) {
            return;
        }
        if (strArr.length == 0) {
            if (this.m_ResultCallbacks != null && this.m_Activity != null && this.m_Looper != null) {
                String[] stringArray = getArguments().getStringArray(PERMISSION_NAMES);
                if (this.m_ResultCallbacks instanceof UnityPermissions.ModalWaitForPermissionResponse) {
                    reportAllDenied(stringArray);
                } else {
                    new Handler(this.m_Looper).post(new RunnableC28717a(stringArray));
                }
            }
        } else {
            for (int i2 = 0; i2 < strArr.length && i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                IPermissionRequestCallbacks iPermissionRequestCallbacks = this.m_ResultCallbacks;
                if (iPermissionRequestCallbacks != null && this.m_Activity != null && this.m_Looper != null) {
                    if (iPermissionRequestCallbacks instanceof UnityPermissions.ModalWaitForPermissionResponse) {
                        iPermissionRequestCallbacks.onPermissionGranted(strArr[i2]);
                    } else {
                        String str = strArr[i2];
                        if (str == null) {
                            str = "<null>";
                        }
                        String str2 = str;
                        new Handler(this.m_Looper).post(new RunnableC28718b(this, this.m_ResultCallbacks, str2, iArr[i2], this.m_Activity.shouldShowRequestPermissionRationale(str2)));
                    }
                }
            }
        }
        FragmentTransaction beginTransaction = getActivity().getFragmentManager().beginTransaction();
        beginTransaction.remove(this);
        beginTransaction.commit();
    }

    public PermissionFragment(Activity activity, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.m_ResultCallbacks = iPermissionRequestCallbacks;
        this.m_Activity = activity;
        this.m_Looper = Looper.myLooper();
    }
}

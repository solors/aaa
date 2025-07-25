package com.facebook.unity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes4.dex */
public abstract class FBUnityAppLinkBaseActivity extends Activity {
    private Class<?> getMainActivityClass() {
        try {
            return Class.forName(getPackageManager().getLaunchIntentForPackage(getPackageName()).getComponent().getClassName());
        } catch (Exception unused) {
            Log.e(C13581FB.TAG, "Unable to find Main Activity Class");
            return null;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        String str = C13581FB.TAG;
        Log.v(str, "Saving deep link from deep linking activity");
        C13581FB.SetIntent(getIntent());
        Log.v(str, "Returning to main activity");
        startActivity(new Intent(this, getMainActivityClass()));
        finish();
    }
}

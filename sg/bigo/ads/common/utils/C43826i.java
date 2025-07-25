package sg.bigo.ads.common.utils;

import com.ironsource.C21114v8;
import java.util.Locale;

/* renamed from: sg.bigo.ads.common.utils.i */
/* loaded from: classes10.dex */
public final class C43826i {

    /* renamed from: a */
    public static final String f114662a = String.format(Locale.ENGLISH, ";\n    (function(omidGlobal) {\n        try {\n            this.geometryChangeCallback = false;\n            var omVer = Object.keys(omidGlobal.OmidVerificationClient)[0];\n            var verificationClient = new omidGlobal.OmidVerificationClient[omVer]();\n            var eventTypes = [\"%4$s\", \"%5$s\", \"%6$s\"];\n            for (var i = 0; i < eventTypes.length; i++) {\n                verificationClient.addEventListener(eventTypes[i], function(event) {\n                    if (event.type == \"%6$s\") { \n                       var pixels = event.data.adView.onScreenGeometry.pixels;\n                       if ( pixels <= 0 || this.geometryChangeCallback) { return; }\n                       %1$s.onCustomJSEventCallback(\"%2$s\", JSON.stringify(event));\n                       this.geometryChangeCallback = true;\n                    } else {\n                       %1$s.onCustomJSEventCallback(\"%2$s\", JSON.stringify(event));\n                    }\n                });\n            }\n        } catch (e) {\n            var errorJson = {};\n            errorJson.type = \"%2$s\";\n            errorJson.message = e.toString();\n            %1$s.onCustomJSEventCallback(\"%3$s\", JSON.stringify(errorJson));\n        }\n    }(typeof global === 'undefined' ? this : global));", "bigossp", "om_adEvent", "om_errorEvent", C21114v8.C21122h.f54087r, "impression", "geometryChange");
}

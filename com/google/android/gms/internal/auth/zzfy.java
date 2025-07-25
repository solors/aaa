package com.google.android.gms.internal.auth;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes5.dex */
public final class zzfy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzfw zzfwVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzfwVar, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzb(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb2, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb2, i, str, entry);
            }
        } else {
            sb2.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzgw.zza(zzee.zzl((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzee) {
                sb2.append(": \"");
                sb2.append(zzgw.zza((zzee) obj));
                sb2.append('\"');
            } else if (obj instanceof zzeu) {
                sb2.append(" {");
                zzd((zzeu) obj, sb2, i + 2);
                sb2.append("\n");
                while (i2 < i) {
                    sb2.append(' ');
                    i2++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zzb(sb2, i4, "key", entry2.getKey());
                zzb(sb2, i4, "value", entry2.getValue());
                sb2.append("\n");
                while (i2 < i) {
                    sb2.append(' ');
                    i2++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static void zzd(zzfw zzfwVar, StringBuilder sb2, int i) {
        Method[] declaredMethods;
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzfwVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith(KiwiConstants.f2714as)) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith(KiwiConstants.f2714as)) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String concat = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i, zzc(concat), zzeu.zze(method2, zzfwVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i, zzc(concat2), zzeu.zze(method3, zzfwVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey(KiwiConstants.f2714as.concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get(KiwiConstants.f2714as.concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object zze = zzeu.zze(method4, zzfwVar, new Object[0]);
                    if (method5 == null) {
                        if (zze instanceof Boolean) {
                            if (((Boolean) zze).booleanValue()) {
                                zzb(sb2, i, zzc(concat3), zze);
                            }
                        } else if (zze instanceof Integer) {
                            if (((Integer) zze).intValue() != 0) {
                                zzb(sb2, i, zzc(concat3), zze);
                            }
                        } else if (zze instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zze).floatValue()) != 0) {
                                zzb(sb2, i, zzc(concat3), zze);
                            }
                        } else if (zze instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zze).doubleValue()) != 0) {
                                zzb(sb2, i, zzc(concat3), zze);
                            }
                        } else {
                            if (zze instanceof String) {
                                equals = zze.equals("");
                            } else if (zze instanceof zzee) {
                                equals = zze.equals(zzee.zzb);
                            } else if (zze instanceof zzfw) {
                                if (zze != ((zzfw) zze).zzh()) {
                                    zzb(sb2, i, zzc(concat3), zze);
                                }
                            } else {
                                if ((zze instanceof Enum) && ((Enum) zze).ordinal() == 0) {
                                }
                                zzb(sb2, i, zzc(concat3), zze);
                            }
                            if (!equals) {
                                zzb(sb2, i, zzc(concat3), zze);
                            }
                        }
                    } else if (((Boolean) zzeu.zze(method5, zzfwVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i, zzc(concat3), zze);
                    }
                }
            }
        }
        if (!(zzfwVar instanceof zzet)) {
            zzgz zzgzVar = ((zzeu) zzfwVar).zzc;
            if (zzgzVar != null) {
                zzgzVar.zze(sb2, i);
                return;
            }
            return;
        }
        zzet zzetVar = (zzet) zzfwVar;
        throw null;
    }
}

package p691h1;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.mraid.C10474e;
import com.explorestack.iab.mraid.InterfaceC10486n;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: h1.b */
/* loaded from: classes3.dex */
public final class C33460b implements InterfaceC33463c {
    @NonNull

    /* renamed from: a */
    private final InterfaceC10486n f91307a = new C33462b();
    @Nullable

    /* renamed from: b */
    private String f91308b;

    /* renamed from: h1.b$b */
    /* loaded from: classes3.dex */
    private static class C33462b implements InterfaceC10486n {
        @NonNull

        /* renamed from: a */
        private static final List<String> f91309a = Arrays.asList("readFile", "writeFile", "readDefaults", "writeDefaults");

        private C33462b() {
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10486n
        /* renamed from: a */
        public boolean mo23838a(@NonNull String str, @NonNull Map<String, String> map) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1406748165:
                    if (str.equals("writeFile")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1202102447:
                    if (str.equals("writeDefaults")) {
                        c = 1;
                        break;
                    }
                    break;
                case -867956686:
                    if (str.equals("readFile")) {
                        c = 2;
                        break;
                    }
                    break;
                case -802768376:
                    if (str.equals("readDefaults")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    return map.containsKey("path") && map.containsKey("data");
                case 2:
                case 3:
                    return map.containsKey("path");
                default:
                    return true;
            }
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10486n
        /* renamed from: b */
        public boolean mo23837b(@Nullable String str) {
            return f91309a.contains(str);
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10486n
        @NonNull
        /* renamed from: a */
        public String mo23839a(@NonNull String str) {
            return str.substring(16);
        }
    }

    @Override // p691h1.InterfaceC33463c
    @NonNull
    /* renamed from: a */
    public InterfaceC10486n mo23836a() {
        return this.f91307a;
    }

    @Override // p691h1.InterfaceC33463c
    @NonNull
    /* renamed from: b */
    public String mo23833b() {
        if (this.f91308b == null) {
            this.f91308b = new String(Base64.decode("KGZ1bmN0aW9uKGMsZCl7dmFyIHI9YixlPWMoKTt3aGlsZSghIVtdKXt0cnl7dmFyIGY9cGFyc2VJbnQocigweDEyZCkpLzB4MSooLXBhcnNlSW50KHIoMHgxMmMpKS8weDIpKy1wYXJzZUludChyKDB4MTJhKSkvMHgzK3BhcnNlSW50KHIoMHgxM2MpKS8weDQqKHBhcnNlSW50KHIoMHgxNDcpKS8weDUpK3BhcnNlSW50KHIoMHgxMzYpKS8weDYrcGFyc2VJbnQocigweDEyOCkpLzB4NytwYXJzZUludChyKDB4MTNmKSkvMHg4Ky1wYXJzZUludChyKDB4MTJlKSkvMHg5O2lmKGY9PT1kKWJyZWFrO2Vsc2UgZVsncHVzaCddKGVbJ3NoaWZ0J10oKSk7fWNhdGNoKGcpe2VbJ3B1c2gnXShlWydzaGlmdCddKCkpO319fShhLDB4NWQ3NzcpLGZ1bmN0aW9uKCl7dmFyIHM9YixjPXdpbmRvd1snbmF0aXZlU3RvcmFnZSddPXt9LGQ9Y1tzKDB4MTQ1KV09eydSRUFEX0ZJTEVfU1VDQ0VTU19FVkVOVCc6cygweDEzYSksJ1JFQURfREVGQVVMVFNfU1VDQ0VTU19FVkVOVCc6cygweDEzYiksJ0VSUk9SX0VWRU5UJzpzKDB4MTM3KX0sZT17fTtjWydhZGRFdmVudExpc3RlbmVyJ109ZnVuY3Rpb24oaixrKXt2YXIgdD1zO2lmKCFqfHwha3x8IWYoaixkKSlyZXR1cm47dmFyIGw9ZVtqXT1lW2pdfHxbXTtmb3IodmFyIG09MHgwO208bFt0KDB4MTMzKV07bSsrKXt2YXIgbj1TdHJpbmcoayksbz1TdHJpbmcobFttXSk7aWYoaz09PWxbbV18fG49PT1vKXJldHVybjt9bFt0KDB4MTNkKV0oayk7fSxjWydyZW1vdmVFdmVudExpc3RlbmVyJ109ZnVuY3Rpb24oaixrKXt2YXIgdT1zO2lmKCFqfHwhZihqLGQpKXJldHVybjtpZihlW3UoMHgxMzApXShqKSl7aWYoayl7dmFyIGw9ZVtqXSxtPWxbdSgweDEzMyldO2Zvcih2YXIgbj0weDA7bjxtO24rKyl7dmFyIG89bFtuXSxwPVN0cmluZyhrKSxxPVN0cmluZyhvKTtpZihrPT09b3x8cD09PXEpe2xbJ3NwbGljZSddKG4sMHgxKTticmVhazt9fWxbdSgweDEzMyldPT09MHgwJiZkZWxldGUgZVtqXTt9ZWxzZSBkZWxldGUgZVtqXTt9fSxjW3MoMHgxNDEpXT1mdW5jdGlvbihpKXt2YXIgdj1zLGo9digweDEzNSkrZW5jb2RlVVJJQ29tcG9uZW50KGkpO2codigweDEzOCkraik7fSxjW3MoMHgxNDApXT1mdW5jdGlvbihpLGope3ZhciB3PXMsaz13KDB4MTM1KStlbmNvZGVVUklDb21wb25lbnQoaSkrJyZkYXRhPScrZW5jb2RlVVJJQ29tcG9uZW50KGopO2codygweDEyZikrayk7fSxjW3MoMHgxMzQpXT1mdW5jdGlvbihpKXt2YXIgeD1zLGo9eCgweDEzNSkrZW5jb2RlVVJJQ29tcG9uZW50KGkpO2coeCgweDE0Mykraik7fSxjW3MoMHgxNDQpXT1mdW5jdGlvbihpLGope3ZhciB5PXMsaz15KDB4MTM1KStlbmNvZGVVUklDb21wb25lbnQoaSkrJyZkYXRhPScrZW5jb2RlVVJJQ29tcG9uZW50KGopO2coeSgweDEyOSkrayk7fSxjW3MoMHgxMmIpXT1mdW5jdGlvbihpLGope3ZhciB6PXM7aChjW3ooMHgxNDUpXVt6KDB4MTMxKV0saSxqKTt9LGNbJ2ZpcmVSZWFkRGVmYXVsdHNTdWNjZXNzRXZlbnQnXT1mdW5jdGlvbihpLGope3ZhciBBPXM7aChjWydFVkVOVFMnXVtBKDB4MTNlKV0saSxqKTt9LGNbJ2ZpcmVFcnJvckV2ZW50J109ZnVuY3Rpb24oaSl7dmFyIEI9cztoKGNbQigweDE0NSldWydFUlJPUl9FVkVOVCddLGkpO307dmFyIGY9ZnVuY3Rpb24oaixrKXtmb3IodmFyIGwgaW4gayl7aWYoa1tsXT09PWopcmV0dXJuISFbXTt9cmV0dXJuIVtdO30sZz1mdW5jdGlvbihpKXt2YXIgQz1zO3dpbmRvd1tDKDB4MTQ5KV09QygweDE0MikraTt9LGg9ZnVuY3Rpb24oail7dmFyIEQ9cyxrPUFycmF5Wydwcm90b3R5cGUnXVtEKDB4MTQ2KV1bRCgweDE0OCldKGFyZ3VtZW50cyk7a1tEKDB4MTM5KV0oKTt2YXIgbD1lW2pdO2lmKGwpe3ZhciBtPWxbRCgweDE0NildKCksbj1tW0QoMHgxMzMpXTtmb3IodmFyIG89MHgwO288bjtvKyspe21bb11bRCgweDEzMildKG51bGwsayk7fX19O30oKSk7ZnVuY3Rpb24gYihjLGQpe3ZhciBlPWEoKTtyZXR1cm4gYj1mdW5jdGlvbihmLGcpe2Y9Zi0weDEyODt2YXIgaD1lW2ZdO3JldHVybiBoO30sYihjLGQpO31mdW5jdGlvbiBhKCl7dmFyIEU9WydzbGljZScsJzVubGtBS0onLCdjYWxsJywnbG9jYXRpb24nLCc0MDE0MjY5RFRYS1RVJywnd3JpdGVEZWZhdWx0cz8nLCc4ODE2NThvQVlkWnYnLCdmaXJlUmVhZEZpbGVTdWNjZXNzRXZlbnQnLCc0MjQ5MjhaTkxIUHAnLCcyWGZJbWpnJywnOTgyNjQ5N2NZYXFVQicsJ3dyaXRlRmlsZT8nLCdoYXNPd25Qcm9wZXJ0eScsJ1JFQURfRklMRV9TVUNDRVNTX0VWRU5UJywnYXBwbHknLCdsZW5ndGgnLCdyZWFkRGVmYXVsdHMnLCdwYXRoPScsJzE5NzQwOTBZem9kd1knLCdlcnJvcicsJ3JlYWRGaWxlPycsJ3NoaWZ0JywncmVhZEZpbGVTdWNjZXNzJywncmVhZERlZmF1bHRzU3VjY2VzcycsJzI3NDExODhSeW5pUGsnLCdwdXNoJywnUkVBRF9ERUZBVUxUU19TVUNDRVNTX0VWRU5UJywnNDg0NTY1Nk5na3NERicsJ3dyaXRlRmlsZScsJ3JlYWRGaWxlJywnbmF0aXZlc3RvcmFnZTovLycsJ3JlYWREZWZhdWx0cz8nLCd3cml0ZURlZmF1bHRzJywnRVZFTlRTJ107YT1mdW5jdGlvbigpe3JldHVybiBFO307cmV0dXJuIGEoKTt9", 0));
        }
        return this.f91308b;
    }

    @Override // p691h1.InterfaceC33463c
    /* renamed from: a */
    public boolean mo23834a(@NonNull String str) {
        return str.startsWith("nativestorage://");
    }

    @Override // p691h1.InterfaceC33463c
    /* renamed from: a */
    public void mo23835a(@Nullable C10474e c10474e, @NonNull String str, @NonNull Map<String, String> map) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1406748165:
                if (str.equals("writeFile")) {
                    c = 0;
                    break;
                }
                break;
            case -1202102447:
                if (str.equals("writeDefaults")) {
                    c = 1;
                    break;
                }
                break;
            case -867956686:
                if (str.equals("readFile")) {
                    c = 2;
                    break;
                }
                break;
            case -802768376:
                if (str.equals("readDefaults")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C33464d.m23825h(c10474e, map.get("path"), map.get("data"));
                return;
            case 1:
                C33464d.m23829d(c10474e, map.get("path"), map.get("data"));
                return;
            case 2:
                C33464d.m23826g(c10474e, map.get("path"));
                return;
            case 3:
                C33464d.m23830c(c10474e, map.get("path"));
                return;
            default:
                return;
        }
    }
}

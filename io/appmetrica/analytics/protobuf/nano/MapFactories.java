package io.appmetrica.analytics.protobuf.nano;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MapFactories {
    private static volatile MapFactory mapFactory = new DefaultMapFactory();

    /* loaded from: classes9.dex */
    public static class DefaultMapFactory implements MapFactory {
        private DefaultMapFactory() {
        }

        @Override // io.appmetrica.analytics.protobuf.nano.MapFactories.MapFactory
        public <K, V> Map<K, V> forMap(Map<K, V> map) {
            if (map == null) {
                return new HashMap();
            }
            return map;
        }
    }

    /* loaded from: classes9.dex */
    public interface MapFactory {
        <K, V> Map<K, V> forMap(Map<K, V> map);
    }

    private MapFactories() {
    }

    public static MapFactory getMapFactory() {
        return mapFactory;
    }

    static void setMapFactory(MapFactory mapFactory2) {
        mapFactory = mapFactory2;
    }
}

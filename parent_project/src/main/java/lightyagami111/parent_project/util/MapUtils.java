/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightyagami111.parent_project.util;

import java.util.*;

/**
 *
 * @author Ivaylo Rusev
 */
public class MapUtils {

    /**
     *
     * @param map in kind of
     *            "k1, k2" : v1,
     *            "k2, k3" : v2,
     *            "k3, k4" : v3,
     *            ....
     * @param key
     *          "k2"
     * @param <V>
     * @return
     *  "k1, k2", "k2, k3"
     */
    public static <V> List<String> findMatchedKeys(Map<String,V> map, String key) {
        List<String> resultKeys = new ArrayList<>();

        Set<String> keySet = map.keySet();
        for (String k : keySet) {
            String[] subKeySet = k.split(",");
            for (String subKey : subKeySet) {
                if (subKey.trim().equals(key)) {
                    resultKeys.add(k);
                }
            }
        }
        return resultKeys;
    }

    /**
     *
     * @param map in kind of
     *            "k1, k2" : v1,
     *            "k2, k3" : v2,
     *            "k3, k4" : v3,
     *            ....
     * @param key
     *          "k2"
     * @param <V>
     * @return map
     *  "k1, k2" : v1,
     *  "k2, k3" : v2
     */
    public static <V> Map<String, V> getMatchedKeysValue(Map<String,V> map, String key) {
        Map<String, V> resultMap = new HashMap<>();
        List<String> matchedKeys = findMatchedKeys(map, key);
        for (String matchedKey : matchedKeys) {
            resultMap.put(matchedKey, map.get(matchedKey));
        }
        return resultMap;
    }
    
    
    
}

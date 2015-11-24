package org.mahjong4j.yaku.yakuman;

import org.mahjong4j.yaku.normals.NormalYakuResolver;

/**
 * @author yu1ro
 *         緑一色判定クラス
 */
public class RyuisoYakuResolver implements NormalYakuResolver {

    final int[] ryuisoHhands = {
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 1, 1, 1, 0, 1, 0, 1, 0,
            0, 0, 0, 0,
            0, 1, 0
    };

    int[] hands;

    public int getHan() {
        return 0;
    }

    public boolean isMatch() {
        return false;
    }

    public boolean isRyuiso(int[] hands) {
        for (int i = 0; i < hands.length; i++) {
            if (ryuisoHhands[i] == 0 && hands[i] > 0) {
                return false;
            } else if (ryuisoHhands[i] == 1 && hands[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
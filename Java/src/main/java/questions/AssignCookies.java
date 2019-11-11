package questions;

import java.util.Arrays;

/**
 * Created by user3301 on 9/26/2017.
 */
public class AssignCookies {

    /**
     * solution that exceed time limit
     *
     * @param g
     * @param s
     * @return
     */
//    public int findContentChildren(int[] g, int[] s) {
//        if (g.length == 0 || s.length == 0) return 0;
//        List<Integer> gList = new LinkedList<>();
//        for (int i : g) {
//            gList.add(i);
//        }
//        List<Integer> sList = new LinkedList<>();
//        for (int i : s) {
//            sList.add(i);
//        }
//        Collections.sort(gList);
//        Collections.sort(sList);
//        int count = 0;
//        for (int i = 0; i < gList.size(); i++) {
//            for (int j = 0; j < sList.size(); j++) {
//                if (gList.get(i) <= sList.get(j)) {
//                    sList = sList.subList(j + 1, sList.size());
//                    count++;
//                    break;
//                }
//            }
//        }
//        return count;
//    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0; i < s.length && count < g.length; i++) {
            if (g[count] <= s[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        AssignCookies assignCookies = new AssignCookies();
        System.out.println(assignCookies.findContentChildren(new int[]{494, 324, 293, 199, 164, 32, 428, 155, 229, 452, 99, 433, 189, 47, 15, 37, 199, 81, 16, 110, 318, 253, 79, 31, 92, 337, 251, 448, 463, 178, 418, 399, 466, 284, 311, 403, 337, 89, 322, 405, 507, 367, 278, 173, 366, 399, 145, 125, 444, 505, 38, 181, 349, 194, 253, 521, 86, 353, 493, 514, 385, 273, 128, 526, 449, 420, 478, 184, 361, 444, 392, 359, 463, 395, 275, 436, 378, 363, 242, 396, 32, 140, 321, 137, 207, 130, 179, 185, 402, 160, 332, 57, 34, 80, 99, 497, 479, 317, 25, 173, 64, 314, 276, 504, 354, 430, 261, 247, 40, 266, 55, 301, 243, 184, 181, 313, 102, 487, 132, 478, 185, 223, 117, 141, 333, 353, 403, 184, 209, 188, 426, 8, 297, 314, 503, 143, 195, 513, 279, 54, 399, 17, 201, 281, 346, 122, 141, 183, 369, 330, 469, 56, 292, 65, 447, 120, 414, 279, 515, 382, 78, 290, 306, 420, 3, 113, 292, 426, 252, 100, 248, 157, 158, 320, 507, 61, 13, 143, 33, 321, 316, 48, 470, 345, 524, 429, 139, 439, 41, 433, 170, 168, 30, 422, 41, 79, 521, 222, 193, 115, 44, 121, 279, 226, 516, 188, 298, 130, 2, 438, 196, 277, 186, 401, 77, 285, 228, 167, 316, 500, 397, 286, 391, 11, 454, 453, 441, 60, 520, 107, 407, 134, 480, 327, 213, 217, 177, 494, 40, 337, 360, 74, 435, 16, 485, 33, 206, 237, 432, 181, 183, 197, 174, 241, 363, 474, 12, 21, 3, 190, 388, 182, 261, 447, 133, 514, 68, 91, 65, 232, 309, 272, 30, 50, 226, 70, 171, 306, 281, 312, 186, 491, 459, 485, 251, 115, 315, 54, 497, 488, 97, 79, 80, 342, 402, 308, 99, 132, 255, 98, 297, 64, 408, 396, 485, 325, 24, 422, 306, 395, 519, 279, 386, 316, 127, 41, 435, 463, 433, 158, 35, 123, 526, 458, 321, 4, 161, 502, 429, 423, 201, 219, 223, 222, 324, 273, 481, 146, 440, 195, 263, 384, 19, 393, 123, 414, 515, 286, 234, 526, 288, 381, 173, 177, 7, 238, 372, 111, 191, 207, 218, 479, 363, 32, 429, 507, 223, 175, 407, 455, 209, 282, 105, 71, 269, 158, 324, 84, 494, 42, 474, 79, 312, 295, 269, 3, 437, 505, 200, 389, 102, 301, 174, 71, 462, 361, 259, 409, 204, 258, 237, 154, 210, 205, 63, 378, 57, 280, 189, 287, 373, 188, 192, 444, 213, 66, 458, 293, 82, 143, 57, 396, 33, 277, 87, 498, 93, 329, 80, 171, 89, 180, 86, 485, 97, 122, 279, 256, 238, 456, 403, 145, 441, 174, 112, 498, 320, 100, 430, 440, 261, 174, 333, 157, 501, 132, 378, 320, 512, 161, 252, 13, 135, 240, 5, 25, 144, 444, 150, 189, 331, 142, 412, 363, 364, 385, 157, 16, 442, 15, 51, 314, 461, 446, 13, 53, 116, 340, 414, 14, 82, 471, 133, 482, 11, 335, 487, 308, 475, 376, 410, 181, 473, 138, 401, 329, 86, 34, 95, 66, 105, 374, 421, 447, 198, 203, 437, 517, 382, 369, 410, 76, 178, 308, 240, 144, 270, 492, 128, 384, 438, 426, 366, 361, 330, 128, 275, 383, 111, 379, 418, 282, 43, 335, 409, 212, 466, 471, 285, 221, 464, 330, 327, 166, 197, 324, 294, 459, 150, 169, 227, 262, 297, 262, 73, 138, 479, 141, 92, 19, 253, 259, 198, 230, 381, 400, 414, 235, 1, 9, 390, 196, 98, 326, 340, 324, 420, 490, 222, 9, 353, 314, 223, 235, 208, 348, 302, 481, 393, 225, 400, 165, 357, 443, 253, 16, 400, 344, 393, 269, 378, 183, 329, 304, 426, 346, 323, 441, 404, 263, 468, 500, 430, 406, 372, 289, 216, 213, 500, 260, 517, 448, 488, 490, 348, 487, 100, 41, 398, 96, 283, 393, 48, 58, 5, 257, 276, 207, 487, 344, 406, 339, 368, 267, 328, 491, 158, 410, 159, 434, 399, 264, 81, 159, 293, 77, 225, 526, 42, 160, 305, 8, 204, 62, 178, 316, 265, 216, 503, 423, 135, 72, 329, 111, 103, 172, 508, 62, 421, 194, 28, 90, 237, 281, 136, 68, 411, 373, 462, 406, 144, 426, 497, 86, 161, 307, 510, 334, 121, 501, 81, 268, 3, 369, 336, 285, 167, 429, 259, 143, 479, 201, 175, 110, 141, 460, 263, 206, 120, 92, 22, 244, 314, 268, 399, 322, 102, 266, 328, 254, 83, 256, 474, 278, 186, 469, 304, 376, 371, 175, 520, 428, 455, 111, 489, 319, 110, 286, 166, 89, 211, 314, 77, 121, 415, 317, 465, 340, 121, 284, 519, 488, 344, 233, 339, 341, 278, 246, 137, 517, 111, 150, 34, 271, 509, 379, 517, 351, 262, 161, 189, 365, 292, 462, 341, 374, 287, 29, 299, 239, 432, 407, 377, 447, 71, 326, 173, 237, 311, 451, 255, 395, 221, 470, 81, 374, 275, 38, 454, 210, 360, 189, 193, 133, 214, 380, 220, 43, 197, 282, 47, 300, 124, 298, 103, 32, 32, 205, 28, 53, 361, 42, 253, 230, 148, 389, 286, 250, 330, 184, 513, 525, 42, 32, 175, 303, 492, 286, 406, 69, 510, 456, 83, 105, 342, 367, 265, 4, 201, 249, 294, 102, 205, 273, 484, 228, 71, 395, 271, 421, 344, 341, 155, 525, 278, 82, 137, 359, 381, 269, 279, 421, 4, 43, 469, 522, 280, 394, 468, 85, 478, 188, 312, 124, 95, 36, 183, 484, 458, 271, 202, 213, 319, 332, 73, 497, 443, 161, 132, 88, 67, 280, 90, 480, 197, 296, 181, 145, 9, 440, 439, 52, 331, 231, 249, 109, 244, 462, 500, 506, 501, 503, 96, 478, 158, 224, 200, 386, 432, 195, 202, 222, 438, 383, 462, 8, 312, 251, 246, 425}, new int[]{383, 384, 347, 280, 433, 481, 462, 56, 487, 9, 162, 245, 485, 90, 380, 257, 364, 383, 451, 146, 48, 6, 366, 333, 490, 319, 438, 147, 212, 156, 296, 298, 241, 239, 36, 13, 187, 475, 154, 89, 399, 301, 175, 460, 143, 209, 237, 49, 5, 341, 115, 427, 92, 49, 304, 401, 283, 277, 251, 464, 171, 217, 369, 244, 495, 295, 422, 408, 20, 319, 113, 488, 27, 452, 302, 203, 373, 304, 160, 521, 92, 378, 317, 491, 232, 520, 182, 483, 270, 423, 298, 433, 264, 226, 283, 389, 23, 323, 364, 343, 60, 351, 282, 44, 306, 436, 273, 19, 330, 217, 89, 163, 445, 291, 439, 506, 107, 228, 436, 438, 16, 133, 197, 42, 145, 450, 100, 341, 98, 248, 94, 10, 30, 332, 518, 315, 111, 67, 85, 131, 296, 489, 32, 54, 249, 127, 211, 177, 328, 216, 511, 177, 185, 463, 386, 163, 43, 245, 435, 163, 70, 327, 503, 276, 101, 371, 58, 230, 410, 174, 187, 271, 144, 45, 335, 45, 140, 499, 2, 474, 512, 27, 260, 91, 52, 160, 49, 346, 180, 150, 59, 495, 42, 483, 275, 310, 351, 89, 135, 155, 76, 317, 495, 311, 185, 134, 396, 108, 240, 217, 417, 513, 317, 269, 316, 412, 390, 23, 259, 132, 407, 465, 283, 84, 173, 406, 425, 101, 106, 525, 379, 105, 202, 366, 410, 15, 344, 475, 519, 353, 275, 89, 415, 59, 452, 354, 118, 293, 484, 286, 81, 130, 359, 269, 223, 147, 511, 326, 418, 68, 321, 219, 331, 14, 374, 110, 4, 350, 446, 379, 105, 484, 209, 95, 505, 185, 509, 498, 248, 136, 449, 289, 54, 430, 399, 293, 311, 90, 93, 291, 113, 339, 47, 213, 181, 286, 239, 231, 495, 520, 318, 7, 437, 228, 83, 286, 24, 340, 358, 514, 339, 233, 303, 193, 239, 225, 239, 29, 434, 178, 109, 519, 434, 200, 413, 422, 42, 356, 255, 346, 429, 249, 484, 282, 346, 488, 408, 74, 2, 76, 239, 419, 230, 324, 511, 195, 396, 67, 427, 285, 273, 105, 226, 113, 318, 166, 224, 498, 382, 429, 170, 447, 92, 408, 386, 526, 302, 76, 10, 191, 488, 250, 133, 475, 42, 280, 479, 237, 492, 125, 344, 190, 390, 435, 461, 129, 494, 465, 441, 175, 252, 203, 205, 229, 87, 331, 88, 408, 43, 46, 238, 77, 37, 267, 121, 494, 157, 121, 347, 509, 511, 386, 132, 285, 112, 129, 287, 4, 18, 92, 188, 365, 241, 143, 4, 202, 78, 329, 496, 421, 194, 77, 45, 66, 466, 520, 268, 498, 40, 385, 525, 213, 375, 477, 58, 35, 357, 322, 311, 48, 526, 496, 403, 516, 162, 424, 518, 88, 486, 252, 89, 327, 365, 282, 512, 339, 487, 492, 501, 54, 521, 117, 475, 317, 254, 362, 247, 77, 201, 119, 304, 492, 305, 161, 133, 493, 45, 398, 42, 31, 476, 486, 93, 191, 183, 149, 258, 7, 125, 316, 93, 384, 440, 82, 512, 37, 151, 228, 328, 39, 21, 166, 447, 311, 351, 66, 122, 320, 48, 176, 281, 384, 145, 313, 187, 29, 327, 186, 489, 400, 391, 20, 243, 200, 333, 42, 496, 253, 292, 76, 105, 128, 182, 241, 284, 406, 247, 203, 42, 342, 375, 53, 383, 200, 461, 453, 144, 187, 313, 154, 349, 369, 48, 267, 154, 149, 423, 362, 426, 271, 507, 28, 197, 312, 107, 364, 45, 211, 260, 337, 347, 501, 78, 101, 390, 44, 247, 323, 101, 435, 442, 66, 442, 11, 204, 24, 121, 458, 347, 304, 234, 340, 500, 364, 103, 418, 24, 211, 59, 253, 95, 285, 177, 472, 425, 16, 315, 146, 497, 187, 108, 114, 47, 451, 171, 228, 518, 35, 411, 142, 63, 125, 28, 241, 157, 502, 503, 236, 82, 434, 481, 48, 494, 501, 45, 349, 179, 451, 246, 253, 526, 15, 203, 156, 482, 134, 78, 36, 284, 146, 45, 142, 113, 357, 75, 510, 131, 482, 362, 133, 148, 100, 147, 112, 343, 304, 50, 482, 348, 496, 337, 498, 468, 448, 326, 107, 219, 122, 360, 2, 476, 16, 479, 524, 34, 384, 160, 441, 353, 370, 48, 71, 255, 50, 131, 306, 419, 238, 505, 501, 470, 136, 235, 409, 215, 153, 148, 82, 120, 478, 403, 352, 341, 112, 466, 102, 75, 116, 426, 69, 129, 294, 178, 136, 498, 29, 487, 492, 343, 449, 132, 71, 218, 501, 27, 410, 449, 352, 410, 337, 152, 374, 342, 456, 418, 520, 91, 461, 317, 467, 498, 163, 227, 202, 449, 158, 218, 215, 30, 361, 333, 315, 171, 140, 2, 233, 67, 411, 104, 108, 415, 381, 478, 167, 111, 441, 413, 95, 238, 524, 35, 256, 147, 97, 85, 444, 227, 324, 93, 431, 57, 326, 378, 51, 31, 272, 91, 183, 237, 304, 198, 414, 502, 136, 109, 154, 258, 327, 165, 523, 10, 269, 97, 515, 518, 242, 171, 379, 136, 425, 302, 412, 458, 366, 244, 177, 276, 122, 108, 41, 61, 233, 413, 391, 180, 492, 469, 117, 280, 22, 488, 473, 188, 3, 108, 30, 346, 423, 230, 412, 53, 464, 491, 16, 476, 457, 120, 149, 259, 254, 458, 336, 366, 129, 111, 479, 153, 169, 150, 376, 260, 477, 218, 79, 307, 349, 440, 46, 426, 381, 67, 409, 437, 425, 231, 31, 237, 197, 477, 304, 218, 393, 70, 221, 199, 312, 514, 61, 76, 193, 226, 428, 516, 298, 479, 124, 149, 116, 222, 436, 314, 101, 224, 370, 11, 297, 361, 32, 273, 490, 115, 39, 181, 453, 31, 401, 295, 58, 327, 440, 175, 169, 133, 384, 103, 166, 283, 80, 360, 464, 51, 82, 109, 140, 43, 74, 209, 357, 275, 359, 340, 247, 454, 415, 136, 227, 350, 100, 399, 396, 510, 318, 22, 239, 461, 485, 60, 345, 7, 443, 25, 374, 85, 467, 272, 278, 387, 29, 94, 461, 232, 518, 318, 206, 460, 401, 168, 17, 406, 190, 385, 68, 55, 428, 348, 288, 55, 272, 290, 265, 118, 372, 504, 490, 142, 218, 360, 422, 350, 317, 515, 107, 167, 150, 508, 454, 152, 475, 34, 246, 483, 177, 80, 227, 423, 358, 75, 197, 481, 510, 130, 116, 402, 18, 110, 157, 22, 114, 122, 359, 237, 190, 167, 96, 432, 24, 58, 358, 470, 465, 57, 285, 163, 226, 257, 83, 57, 298, 524, 237, 45, 39, 452, 170, 301, 478, 1, 341, 476, 293, 170, 510, 390, 330, 149, 271, 499, 213, 61, 91, 95, 98, 9, 340, 78, 79, 46, 438, 456, 272, 481, 479, 306, 321, 368, 27, 10, 136, 394, 387, 216, 29, 458, 136, 278, 423, 164, 400, 520, 356, 201, 352, 19, 188, 33, 229, 289, 105, 273, 251, 516, 505, 285, 88, 291, 305, 213, 173, 470, 383, 239, 504, 190, 242, 305, 500, 208, 484, 242, 377, 325, 409, 2, 29, 343, 8, 488, 526, 54, 449, 80, 313, 511, 396, 204, 15, 377, 14, 475, 267, 94, 217, 294, 392, 34, 133, 79, 91, 260, 84, 295, 263, 449, 456, 278, 436, 18, 114, 436, 491, 509, 46, 198, 46, 377, 128, 357, 97, 188, 216, 293, 111, 498, 33, 22, 84, 41, 520, 312, 470, 442, 404, 86, 75, 213, 274, 45, 223, 73, 54, 199, 289, 81, 93, 31, 67, 97, 461, 91, 515, 285, 280, 139, 126, 370, 142, 196, 192, 392, 4, 422, 172, 304, 393, 352, 156, 105, 514, 106, 510, 337, 255, 167, 95, 424, 339, 455, 102, 81, 179, 391, 185, 410, 404, 368, 494, 398, 290, 20, 525, 218, 395, 194}));
    }
}

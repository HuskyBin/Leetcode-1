package interviews.pinterest.mergeBehavior;

/**
 * http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=306216&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311
 */
public class Solution { // todo;
//  input是数组，数组里的每个对象包含name, timestamp(long value)和value
//  要求跟将相同name的并且落在同一个时间区间内的value 求和。. 鐗涗汉浜戦泦,涓€浜╀笁鍒嗗湴
//  values = [
//      ("ab", 0, 1.0),. 涓€浜�-涓夊垎-鍦帮紝鐙鍙戝竷
//      ("bc", 0, 2.0),
//  ("ab", 30, 1.0),
//      ("bc", 30, 2.0),
//      ("ab", 60, 1.0),
//      ("bc", 60, 2.0),
//      ("ab", 90, 1.0),
//      ("bc", 90, 2.0),
//      . from: 1point3acres.com/bbs
//  给定一个区间是60，那时间区间就是[0, 60), [60, 120), [120, 180)诸如此类
//      要求结果是
//      [
//(“ab”, 0, 2.0),
//      (“bc”, 0, 4.0),.1point3acres缃�
//      (“ab”, 60, 2.0),
//      (“bc”, 60, 4.0)


}

﻿using System.Collections.Generic;

namespace leetcodesln_test.utils
{
    internal static class Helper<T>
    {
        public static bool HaveSameElementsForTwoArray(T[] arr1, T[] arr2)
        {
            if (arr1.Length != arr2.Length) return false;

            var dict = new Dictionary<T, int>();

            foreach (var item in arr1)
            {
                if (dict.ContainsKey(item)) ++dict[item];
                else dict[item] = 1;
            }

            foreach (var item in arr2)
            {
                if (dict.ContainsKey(item))
                {
                    --dict[item];
                    if (dict[item] < 0) return false;
                }
                else return false;
            }

            return true;
        }
    }
}
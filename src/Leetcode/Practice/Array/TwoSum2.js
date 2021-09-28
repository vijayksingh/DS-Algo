function twoSum(nums: number[], target: number): number[] {
    const myMap: Map<number, number> = new Map();

    for (let i = 0; i < nums.length; i++) {
      if (myMap.get(target-nums[i]) ?? 0) {
        return [myMap.get(target-nums[i]) ?? 0, i+1];
      } else {
        myMap.set(nums[i], i+1);
      }
    }
    return [];
};
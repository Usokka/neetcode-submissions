class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        duplicates = {}
        for num in nums :
            if duplicates.get(num) is not None :
                return True
            else :
                duplicates[num] = True
    
        return False
        
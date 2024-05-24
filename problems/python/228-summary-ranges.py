class Solution(object):
    def summaryRanges(self, nums):
        if len(nums) == 0:
            return []
        output = []
        beg = None
        prev = None

        for num in nums:
            if prev == None:
                beg = num
                prev = num
            else:
                if num - 1 != prev:
                    range = str(beg) if beg == prev else str(beg) + "->" + str(prev)
                    output.append(range)
                    beg = num
                prev = num
        range = str(beg) if beg == prev else str(beg) + "->" + str(prev)
        output.append(range)
        return output

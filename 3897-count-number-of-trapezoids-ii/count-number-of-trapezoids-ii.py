class Solution:
    def countTrapezoids(self, points: List[List[int]]) -> int:
        def get_line_equation(x1, y1, x2, y2):
            a = y2 - y1
            b = x1 - x2
            c = x2 * y1 - x1 * y2
            gcd = math.gcd(math.gcd(abs(a), abs(b)), abs(c))
            if a == 0:
                return 0.0, 1.0, c/b
            else:
                return 1.0, 0.0 if b == 0 else b/a, c/a

        n = len(points)
        lines = defaultdict(set)
        for i in range(n):
            for j in range(i+1, n):
                a, b, c = get_line_equation(points[i][0], points[i][1], points[j][0], points[j][1])
                lines[(a, b, c)].add((points[i][0], points[i][1]))
                lines[(a, b, c)].add((points[j][0], points[j][1]))
        parallel = defaultdict(list)
        for key, value in lines.items():
            parallel[(key[0], key[1])].append(len(value))
        total_count = 0
        for _, value in parallel.items():
            total = 0
            total_sqr = 0
            for count in value:
                pairs = (count*(count-1))//2
                total+= pairs
                total_sqr+= pairs*pairs
            total_count+=((total*total-total_sqr) // 2)
            
        def count_parallelogram()->int:
            count = defaultdict(int)
            for i in range(n):
                for j in range(i+1, n):
                    mid_point = (points[i][0]+points[j][0], points[j][1]+points[i][1])
                    count[mid_point]+=1
            total_parallelogram = 0
            for _, value in count.items():
                if value >= 2:
                   total_parallelogram += value*(value-1)//2

            for _, point in lines.items():
                p = len(point)
                if p < 4:
                    continue
                else:
                    mids = defaultdict(int)
                    point_line = list(point)
                    for i in range(p):
                        for j in range(i+1, p):
                            mid_point = (point_line[i][0]+point_line[j][0], point_line[j][1]+point_line[i][1]) 
                            mids[mid_point]+=1
                    for _, value in mids.items():
                        if value >= 2:
                            total_parallelogram -= value*(value-1)//2
            return total_parallelogram
            
        return total_count - count_parallelogram()
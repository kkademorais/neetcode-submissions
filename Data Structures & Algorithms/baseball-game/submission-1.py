class Solution:
    def calPoints(self, operations: List[str]) -> int:
        sum = 0
        record = []
        for op in operations:
            if op == "+":
                t1 = int(record[len(record)-2])
                t2 = int(record[len(record)-1])
                sum += (t1 + t2)
                record.append((t1+t2))
                continue
            elif op == "D":
                td = int(record[len(record)-1]) * 2
                sum += td
                record.append(td)
                continue
            elif op == "C":
                tp = record.pop(len(record)-1)
                sum -= tp
                continue
            sum += int(op)
            record.append(int(op))
        return sum
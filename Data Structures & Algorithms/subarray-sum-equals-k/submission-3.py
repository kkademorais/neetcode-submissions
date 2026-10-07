class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        soma = 0
        resultado = 0
        mapa = {}
        mapa[0] = 1
        for num in nums:
            soma += num
            diff = soma - k
            resultado += mapa.get(diff,0)
            mapa[soma] = mapa.get(soma,0) + 1
        return resultado

        
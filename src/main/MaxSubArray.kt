package main

class MaxSubArray {

    companion object{

        @JvmStatic fun <T: Number>findMaxSubArray(array: Array<T>): Array<T>{//Алгоритм Кадане
            if (array.isEmpty()){
                return array.clone()
            }
            var currentSum = 0.0
            var leftIndex = 0
            var currentLeftPos = 0
            var rightIndex = 0
            var maxSum = array[0].toDouble()
            for (index in 0..array.lastIndex){
                currentSum += array[index].toDouble()
                if (currentSum > maxSum){
                    maxSum = currentSum
                    rightIndex = index
                    leftIndex = currentLeftPos
                }
                if (currentSum <= 0) {
                    currentSum = 0.0
                    currentLeftPos = index + 1
                }
            }
            return array.copyOfRange(leftIndex, rightIndex + 1)
        }

        
    }
}
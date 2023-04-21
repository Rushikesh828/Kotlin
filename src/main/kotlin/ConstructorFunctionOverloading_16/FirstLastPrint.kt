package ConstructorFunctionOverloading_16

class FirstLastPrint {

    fun firstLastPrint(mutableList: MutableList<Int>) {
        val resultList = mutableListOf<Int>()
        var isRemoveFirst : Boolean = true

        for (i in 0 until mutableList.size) {

            if (isRemoveFirst) {
                isRemoveFirst = false
                resultList.add(mutableList[0])
                mutableList.removeAt(0)

            } else {
                isRemoveFirst = true
                resultList.add(mutableList[mutableList.size-1])
                mutableList.removeAt(mutableList.size-1)
            }
        }

        println(resultList)
    }

    fun firstLastPrint(array: Array<Int>) {
        var mutableList = array.toMutableList()
        val resultList = mutableListOf<Int>()
        var isRemoveFirst : Boolean = true

        for (i in 0 until mutableList.size) {

            if (isRemoveFirst) {
                isRemoveFirst = false
                resultList.add(mutableList[0])
                mutableList.removeAt(0)

            } else {
                isRemoveFirst = true
                resultList.add(mutableList[mutableList.size-1])
                mutableList.removeAt(mutableList.size-1)
            }
        }

        println(resultList)
    }
}
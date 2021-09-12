package codewarskt


class DiffOf2Collections {

    fun diff(listA: Collection<Char>, listB: Collection<Char>): List<Char> {
        val setA = listA.toSet().filter { !listB.contains(it) }
        val setB = listB.toSet().filter { !listA.contains(it) }
        val resultSet = setA + setB
        return resultSet.toList()
    }
}
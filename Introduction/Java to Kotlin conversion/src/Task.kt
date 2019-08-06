fun toJSON(collection: Collection<Int>): String = collection.joinToString(separator = ", ", prefix = "[", postfix = "]")

package com.dzik.bcon.utils.database


interface Dao<Key, Type> {
    fun create(entity: Type): Type?
    fun find(key: Key): Type?
    fun findAll(): MutableList<Type>
    fun update(entity: Type): Type?
    fun delete(entity: Type): Boolean
}
package be.mafken.gowalk.model

data class Walk(
 var id: Int = -1,
 var userId: String = "",
 var amountKm: Int = -1,
 var time: Int = -1,
 var displayTime: String = ""
)
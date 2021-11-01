package ktln.open

class SportsMan {
    fun invokeWaterBoy(waterboy: Waterboy)
    {
        waterboy.bringWater()
    }
    inline fun invokeWaterBoy(bringWater:() ->Unit){
        bringWater()
    }
}
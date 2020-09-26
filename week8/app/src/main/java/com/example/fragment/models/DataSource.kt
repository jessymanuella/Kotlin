package com.example.fragment.models

class DataSource {

    companion object{

        fun createDataSet(): ArrayList<Users>
        {
            val list = ArrayList<Users>()
            list.add(
                Users(
                    "Notthinfldfd",
                "Frank",
                22,
                    1
                )
            )

            list.add(
                    Users(
                        "Notthinfldfd",
                        "Leonel",
                        22,
                        2
                    )
            )
            list.add(
                Users(
                    "Notthinfldfd",
                    "Rest APi",
                    21,
                    3
                )
            )


            return list
        }

    }
}
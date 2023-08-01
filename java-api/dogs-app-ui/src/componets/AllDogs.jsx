import React from 'react'
import DogDetail from './DogDetail'
import { Row } from 'react-bootstrap'


const AllDogs = () => {
    const dogs = [
        { "id": 1, "name": "WW", "age": 3, "ownerName": "Bru" },
        { "id": 2, "name": "WT", "age": 3, "ownerName": "Bru" },
    ]
    return (
        <Row>
            {dogs.map(dog => (
                <div className='container' key={dog.id}>
                    <DogDetail info={dog} />
                </div>
            ))}
        </Row>


    )
}

export default AllDogs
import React from 'react'
import { Card } from 'react-bootstrap'

const DogDetail = (props) => {

  return (
    <Card>
      <Card.Body>
        <Card.Title>ID: {props.info.alias}</Card.Title>
        <Card.Text>Name: {props.info.name}</Card.Text>
        <Card.Text>Age: {props.info.age}</Card.Text>
        <Card.Text>Owner Name: {props.info.ownerName}</Card.Text>
      </Card.Body>
    </Card>
  )
}

export default DogDetail
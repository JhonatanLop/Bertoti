import { useState } from 'react';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import './global.css';

function App() {
  const [count, setCount] = useState(0)

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home/>}>

        </Route>
      </Routes>
    </BrowserRouter>

  )
}

export default App

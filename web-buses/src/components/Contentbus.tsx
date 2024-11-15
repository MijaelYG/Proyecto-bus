import "./Contentbus.css";

import { Bus } from "../Service/BusService";

interface BusContent {
  buses: Bus[];
}

const Contentbus = ({ buses }: BusContent) => {
    
  return (
    <div className="main-tablabus">
      <table>
        <thead>
          <tr>
            <th>Id</th>
            <th>Numero de Bus</th>
            <th>Placa</th>
            <th>Fecha de Creacion</th>
            <th>Caracteristicas</th>
            <th>Marca de Bus</th>
            <th>Actividad</th>
          </tr>
        </thead>
        <tbody>
        {buses.map(bus => (
          <tr key={bus.idBus}>
            <td>{bus.idBus}</td>
            <td>{bus.numero_bus}</td>
            <td>{bus.placa}</td>
            <td>{bus.fecha_creacion}</td>
            <td>{bus.caracteristicas}</td>
            <td>{bus.idMarca_bus}</td>
            <td>{bus.actividad ? 'Activo' : 'Inactivo'}</td>
          </tr>
        ))}
        </tbody>
      </table>
    </div>
  );
};

export default Contentbus;
